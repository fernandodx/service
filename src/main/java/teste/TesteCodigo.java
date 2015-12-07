package teste;

import br.com.service.cgm.ServerCGM;

public class TesteCodigo {

	public static void main(String[] args) {
		
		
		ServerCGM cgm = new ServerCGM();
		
		StringBuilder msg = new StringBuilder();
		msg.append("Retiro Segue Me Psul");
		msg.append(";");
		msg.append("30/10/2015 19:00:00");
		msg.append(";");
		msg.append("19H");
		msg.append(";");
		msg.append("Vale das Lajes");
		msg.append(";");
		msg.append("Não fique de fora, vai ser uma experiência renovadora. Fale com a equipe dirigente ou pós encontro para comprar o ingresso.");
		msg.append(";");
		msg.append("https://www.imageupload.co.uk/images/2015/09/24/retiro_100.jpg");
		msg.append(";");
		msg.append("https://www.imageupload.co.uk/images/2015/09/24/retiro_280.jpg");
		msg.append(";");
		msg.append("retiro30102015");
		msg.append(";");
		msg.append("E");
		
			
		StringBuilder msg2 = new StringBuilder();
		msg2.append("WorkShop Das Pastorais");
		msg2.append(";");
		msg2.append("30/08/2015 09:00:00");
		msg2.append(";");
		msg2.append("09:00h até 12:00h");
		msg2.append(";");
		msg2.append("Paróquia Nossa Senhora Mãe da Divina Providência");
		msg2.append(";");
		msg2.append("Venha conhecer a nossas pastorais.");
		msg2.append(";");
		msg2.append("https://www.imageupload.co.uk/images/2015/08/18/workshop_pastorais100.png");
		msg2.append(";");
		msg2.append("https://www.imageupload.co.uk/images/2015/08/18/workshop_pastorais280.png");
		msg2.append(";");
		msg2.append("workshop30082015");
		msg2.append(";");
		msg2.append("E");
		
		
		cgm.sendMessage(msg.toString());
	
	

	}

}
