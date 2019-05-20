//package application;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.HashMap;
////import java.util.HashMap;
//import java.util.Map;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
////import java.util.HashMap;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.annotation.*;
//public class HM {
//	static Map<String,String> map3;
////	public static Map biggerDataStructure(String jsonFilepath, Map ds1){
////
////		Map map3= new HashMap();
////		try {
////			Map<String,Object> map1 =
////			        (Map<String, Object>) new ObjectMapper().readValue(jsonFilepath, HM.class);
////			map3.putAll(map1);
////			map3.putAll(ds1);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		return map3;
////
////
////
////	}
//
//	public static Map readQuestion(String jsonFilePath, Map ds1)
//			throws FileNotFoundException, IOException, ParseException {
//
//
//		String question;
//		String topic;
//		String imageURL;
//		Object obj = new JSONParser().parse(new FileReader(jsonFilePath));
//		// typecasting to JSONObject
//		JSONObject jsonObj = (JSONObject) obj;
//		JSONArray jsonArr = (JSONArray) jsonObj.get("questionArray");
//		for (int j = 0; j < jsonArr.size(); j++) {
//			JSONObject smallerJSONObj = (JSONObject) jsonArr.get(j);
//			question = (String) smallerJSONObj.get("questionText");
//
//			topic = (String) smallerJSONObj.get("topic");
//
//			// TODO:::::::::::::::::::::::::::::::
////			if (!quizTypeList.contains(topic)) {
////				quizTypeList.add(topic);
////			}
//
//			imageURL = (String) smallerJSONObj.get("image");
//			JSONArray answers = (JSONArray) smallerJSONObj.get("choiceArray");
//			Answer[] answersArray = new Answer[5];
//			for (int i = 0; i < 5; i++) {
//				boolean isCorrect = false;
//				JSONObject answer1 = (JSONObject) answers.get(i);
//				if (answer1.get("isCorrect").equals("T")) {
//					isCorrect = true;
//				}
//				String choice = (String) answer1.get("choice");
//				Answer currAnswer = new Answer(choice, isCorrect);
//				answersArray[i] = currAnswer;
//			}
////			if (quizType.equals(topic)) {
//
//				 map3 = new HashMap<String,String>();
//				map3.put("1", question);
//				map3.put("2", answersArray[0].answer);
//				map3.put("3", answersArray[1].answer);
//				map3.put("4", answersArray[2].answer);
//				map3.put("5", answersArray[3].answer);
//				map3.put("6", answersArray[4].answer);
//				map3.put("7", imageURL);
//				map3.put("8", topic);
//				//map3 = new HashMap<String,String>();
//				//map3.putAll(map1);
//				map3.putAll(ds1);
//
//				//System.out.print(map1.get("1"));
//
//
//
//
//
////				int hash = question.hashCode();
////				this.hashTable.put(hash, new QuestionAnswer(question, answersArray, imageURL, topic));
////				questionList.add(question);
////			}if ends
//			// ADD TO DATA STRUCTURE
//		}
//		return map3;
//
//
//	}
//
//
//	public static void main(String[] args) {
//
//		Map<String,String> map= new HashMap<String,String>();
//		map.put("1", "one");
//		map.put("2", "two");
//		map.put("3", "three");
//		map.put("4", "four");
//		map.put("5", "five");
//		map.put("6", "six");
//		map.put("7", "seven");
//		// TODO Auto-generated method stub
//		try {
//			System.out.println(readQuestion("jsonEx.json", map));
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
