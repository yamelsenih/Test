/**
 * 
 */

/**
 * @author yamel
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int i = 0;
		String stream = ((char) 10) + "0000000582KG" + ((char) 10) + "0000999999KG";
		boolean read = false;
		StringBuffer m_StrReaded = new StringBuffer();
		System.out.println("Stream = " + stream);
		while(i < stream.length()) {
			int bit = stream.charAt(i);
			System.out.println("bit = " + bit);
			if(bit == 10 
					&& read == false){
				read = true;
				m_StrReaded = new StringBuffer();
			}
			if(read)
				m_StrReaded.append((char)bit);
			if(read 
					&& (bit == (char)3 
					|| m_StrReaded.length() == 13)){
				read = false;
				
			}
			System.out.println("Stream Readed = " + m_StrReaded);
			i++;
		}*/
		
//		SimpleDateFormat m_dateFormat = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.SHORT, new Locale("es_VE"));
//		String sFormat = m_dateFormat.toPattern();
//		//	some short formats have only one M and/or d (e.g. ths US)
//		if (sFormat.indexOf("MM") == -1 || sFormat.indexOf("dd") == -1)
//			{
//			sFormat = sFormat.replaceFirst("d+", "dd");
//			sFormat = sFormat.replaceFirst("M+", "MM");
//		//	log.finer(sFormat + " => " + nFormat);
//			m_dateFormat.applyPattern(sFormat);
//		}
//		//	Unknown short format => use JDBC
//		if (m_dateFormat.toPattern().length() != 8)
//			m_dateFormat.applyPattern("yyyy-MM-dd");
//
//		//	4 digit year
//		if (m_dateFormat.toPattern().indexOf("yyyy") == -1)
//		{
//			sFormat = m_dateFormat.toPattern();
//			String nFormat = "";
//			for (int i = 0; i < sFormat.length(); i++)
//			{
//				if (sFormat.charAt(i) == 'y')
//					nFormat += "yy";
//				else
//					nFormat += sFormat.charAt(i);
//			}
//			m_dateFormat.applyPattern(nFormat);
//		}
		//	
//		m_dateFormat.setLenient(true);
		//09-16 12:26:02.550: W/System.err(20682): 1404086400000
		//09-16 12:26:02.550: W/System.err(20682): Sun Jun 29 19:30:00 GMT-04:30 2014
		//09-16 12:26:02.550: W/System.err(20682): dd/MM/yyyy
		//09-16 12:26:02.550: W/System.err(20682): 29/06/2014
//		String strDate = "2014-06-30 00:00:00";
//		System.out.println(strDate);
//		Date date = new Date(1404086400000L);
//		System.out.println(date);
//		System.out.println("sFormat = " + sFormat);
//		System.out.println(m_dateFormat.format(date));
//		System.out.println(m_dateFormat.format(1404086400000L));
//		//	
//		System.out.println(date);
//		System.out.println(m_dateFormat.toPattern());
		/*String a = "B1";
		System.out.println(a);
		System.out.println(a.substring(1));
		System.out.println(a.substring(0, 1));
		System.out.println(Integer.parseInt(a.substring(1)));
		
		
		System.out.println("aaa@AAAA".indexOf("@"));*/
		
		/*GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(System.currentTimeMillis());
		//	Set to Zero Hours...
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		//	
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("Se hacen dos (2) ejemplares de un mismo tenor y a un solo efecto. En Araure a los " + new SimpleDateFormat("dd").format(new Date()) + " del mes de " + new SimpleDateFormat("MM").format(new Date()) + " del " + new SimpleDateFormat("yyyy").format(new Date()));*/
		
		
		/*String name = "Yamel Obed Yemil";
		String name2 = "Senih Rios";
		//	End Index for First Name
		int endIndex = name.indexOf(" ");
		if(endIndex < 0)
			endIndex = name.length();
		//	Extract First Name 1
		String firstName1 = name.substring(0, endIndex);
		//	Extract First Name 2
		String firstName2 = ((endIndex + 1) > name.length()
										? " "
										: name.substring(endIndex + 1));
		endIndex = firstName2.indexOf(" ");
		//	Cut First Name 2
		if(endIndex < 0)
			endIndex = firstName2.length();
		firstName2 = firstName2.substring(0, endIndex);
		//	End Index for Last Name
		endIndex = name2.indexOf(" ");
		if(endIndex < 0)
			endIndex = name2.length();
		//	Extract Last Name 1
		String lastName1 = name2.substring(0, endIndex);
		//	Extract Last Name 2
		String lastName2 = ((endIndex + 1) > name2.length()
										? " "
										: name2.substring(endIndex + 1));
		endIndex = lastName2.indexOf(" ");
		//	Cut Last Name 2
		if(endIndex < 0)
			endIndex = lastName2.length();
		lastName2 = lastName2.substring(0, endIndex);*/
		/*File file = new File("/tmp");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println((file.isFile()? file.getParent(): file.getAbsolutePath()));*/
		
		/*try {
			Runtime.getRuntime().exec("lp /opt/Development/1009869.txt");
			System.out.println("Listo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//String sql = "SELCET * FROM ASHDAGSKDHAS SDSJ <MARK_WHERE>*AD_Column.AD_Column_ID = @AD_Column_ID@";
		//System.out.println(sql.substring(sql.indexOf("<MARK_WHERE>") + "<MARK_WHERE>".length()));
		
		System.out.println("Hello World");
	}

}
