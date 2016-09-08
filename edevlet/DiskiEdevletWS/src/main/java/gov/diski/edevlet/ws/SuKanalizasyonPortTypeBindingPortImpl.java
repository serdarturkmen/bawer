package gov.diski.edevlet.ws;

import gov.diski.edevlet.WebApplicationContextLocator;
import gov.diski.edevlet.model.Abone;
import gov.diski.edevlet.repository.AboneRepository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.web.context.WebApplicationContext;

@javax.jws.WebService(endpointInterface = "gov.diski.edevlet.ws.SuKanalizasyonPortType", targetNamespace = "http://belediye.turkiye.gov.tr/v2", serviceName = "eDevletSuKanalizasyonServis", portName = "SuKanalizasyonPortTypeBindingPort", wsdlLocation = "WEB-INF/wsdl/SuKanalizasyon.wsdl")
public class SuKanalizasyonPortTypeBindingPortImpl {
	
	@Autowired
	private AboneRepository aboneService;
	
	public SuKanalizasyonPortTypeBindingPortImpl() {
		// TODO Auto-generated constructor stub
	}
	
//	service ler inject edilemiyordu web servis servleti calıstıgı için 
//	bu method ile manuel inject ediliyor
	@PostConstruct
    public void init() {
		AutowiredAnnotationBeanPostProcessor bpp = new AutowiredAnnotationBeanPostProcessor();
        WebApplicationContext currentContext = WebApplicationContextLocator.getCurrentWebApplicationContext();
        bpp.setBeanFactory(currentContext.getAutowireCapableBeanFactory());
        bpp.processInjection(this);
    }

	public SuAnalizSorgulamaCType guncelSuAnalizSorgula(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SuAboneBilgisiCType suAboneSorgula(KisiselSorgulamaGType part1) {
        
		Abone abone = new Abone();
		abone = aboneService.findByAboneNo(21);
		System.out.println(abone.getAdi());
		SuAboneBilgisiCType suBilgisiCType = new SuAboneBilgisiCType();
		suBilgisiCType.setBelediyeKodu(abone.getAdi());
		suBilgisiCType.setSonucAciklamasi("aciklama");
		suBilgisiCType.setSonucKodu("sonuc kodu");
		return suBilgisiCType;
//		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SuFaturaSorgulamaCType suFaturaSorgula(SuFaturaSorgulamaGType part1) {
		Abone abone = new Abone();
		abone = aboneService.findByAboneNo(21);
		System.out.println("ikinci method");
		return null;
	}

	public ArizaBilgisiCtype arizaSorgulama(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public FaaliyetBilgisiCType gunlukFaaliyetSorgula(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SOKTipiBilgisiCType sokTipiSorgula(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public IlceBilgisiSorgulamaCType ilceSorgula(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public MahalleSorgulamaCType mahalleSorgula(MahalleSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SokakCaddeSorgulamaCType sokakCaddeSorgula(
			SokakCaddeSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SOKBasvuruYapCType sokBasvuruYap(SOKBasvuruYapGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SOKBasvuruDurumCType sokBasvuruDurumSorgula(
			KisiselSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SOKBasvuruDetaySorgulamaCType sokBasvuruDetaySorgula(
			SOKBasvuruDetaySorgulaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public BarajDolulukBilgisiCType barajDolulukSorgula(SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SuAnalizDokumanIndirCType suAnalizDokumanIndir(
			SorguParametreType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public BinaBilgisiSorgulamaCType binaSorgula(BinaBilgisiSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public DaireBilgisiSorgulamaCType daireSorgula(
			DaireBilgisiSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public AbonelikYapilabilirMiCType abonelikYapilabilirMi(
			AbonelikYapilabilirMiGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public DaskKontrolCType daskKontrol(DaskKontrolGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public SozlesmeIndirCtype sozlesmeIndir(SozlesmeIndirGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public AbonelikbasvuruCType abonelikBasvuru(AbonelikBasvuruGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public AbonelikBasvuruSorgulamaCType abonelikBasvuruSorgula(
			KisiselSorgulamaGType part1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}