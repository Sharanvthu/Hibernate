package com.hibernatecache.Hibernate_ReadVcardFile;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.io.text.VCardReader;
import ezvcard.property.Telephone;

/**
 * Hello world!
 *
 */
public class VCardRead 
{
	static String name;
	static String number;
    public static void main( String[] args ) throws IOException
    {
    	File file=new File("D:\\contact.vcf");
    	if (file.exists()) {
			System.out.println("Present");
		}
//    	VCardReader reader=new VCardReader(file.toPath());
//    	VCard vcard;
//    	System.out.println("====");
//    	while ((vcard=reader.readNext())!=null) {
//			System.out.println(vcard.getFormattedName());
//		}
//    	reader.close();
  
    	
    	
    	List<VCard> list=Ezvcard.parse(file.toPath()).all();
//    	Collections.sort(List<VCard>,new NameComp());
    	for (VCard vCard : list) {
//			System.out.print(vCard.getFormattedName().getValue());
			for (Telephone tel : vCard.getTelephoneNumbers()) {
				name=vCard.getFormattedName().getValue();
				number=tel.getText();
				System.out.println();
				System.out.print(name+"\t\t"+number);
			}
		}	
    }
}
