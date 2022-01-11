package rs.ac.uns.ftn.sluzbenik.jaxb;

import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

@Component
public class JaxB {
	//Kreira java objekat iz datog xml stringa
	public <T> T unmarshall(Class<T> genericClass, String text) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(genericClass);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		@SuppressWarnings("unchecked")
		T createdObject = (T) unmarshaller.unmarshal(new StringReader(text));
		return createdObject;
	}
	//Kreira xml string od datog objekta
	public <T> String marshall(Class<T> genericClass,T objecToMarshall) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(genericClass);
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.marshal(objecToMarshall, sw);
		return sw.toString();
	}
}
