public String frontBack(String str) {
  String result ="";
    if (str == null || str.length() == 0) {
      return str;
  }

  if(str!= null){  
    int firstIndex = 0;
    int lastIndex = str.length()-1;
    StringBuilder sb = new StringBuilder(str);
    char firstChar =  sb.charAt(firstIndex);
    char lastChar =  sb.charAt(lastIndex);
    sb.setCharAt(firstIndex, lastChar);
    sb.setCharAt(lastIndex, firstChar);
    result = sb.toString();
    }
return result;
  
}
