package com.ibm.controller;
import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmailController {
	@Autowired
    private JavaMailSender mailSender;
    
    @Value("${spring.mail.username}")
    private String mailFrom;
    
    @Value("${spring.mail.to}")
    private String mailTo;
    
    @Value("${spring.mail.cc}")
    private String mailCc;
    
    @GetMapping("/simple/mail/send")
    public String sendMail() {
    	String[] toMail = mailTo.split(";");
        for (int i = 0; i < toMail.length; i++) {
        SimpleMailMessage message =	new SimpleMailMessage();
        //发送者
        message.setFrom(mailFrom);
        //主题
        message.setSubject("简单测试邮件");  
        message.setTo(toMail[i]);
        message.setCc(mailCc);
        message.setText("这个是简单测试邮件！");
        mailSender.send(message);
        
    }
        return "send simpleMailMessage success";
    }
    /**
	 * 复杂邮件发送
	 * @return
	 * @throws MessagingException 
	 */
	@GetMapping("/complex/mail/send")
	public String complexMailSend() throws MessagingException {
		String[] toMail = mailTo.split(";");
        for (int i = 0; i < toMail.length; i++) {
		//创建一个复杂的消息邮件
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		//邮件设置
		helper.setSubject("邮件附件发送测试");
		helper.setText("<b style='color:red'>发送邮件附件成功</b>",true);
		helper.setTo(toMail[i]);
		helper.setFrom(mailFrom);
		//上传文件
		helper.addAttachment("1.jpg",new File("src/main/resources/uploadFile/1.jpg"));
		helper.addAttachment("2.jpg",new File("src/main/resources/uploadFile/2.jpg"));
		
		mailSender.send(mimeMessage);
        }
		return "send complexMailMessage success";
	}
}
