package CharacterPassing;

class NotALetterException extends Exception {
        static int count=0;
        String msg;
        
        public NotALetterException(String string) {
		msg=string;   
		}

		

		public static  void countLetter(char c) throws NotALetterException{
        	if(Character.isLetter(c)) {
        		count++;
        		System.out.println(count);
        		
        	}else {
        		throw new NotALetterException(c+"is not letter");
        		
        	}
        	
        		
        	
        }
}

