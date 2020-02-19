package ConsumerLab;

class Main {
  public static void main(String[] args) {
	  System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
	  System.out.println(Review.starRating("src/ConsumerLab/simpleReview.txt"));
	  System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
	  System.out.println(Review.starRating("src/ConsumerLab/26WestReview.txt"));
	  System.out.println(Review.fakeReview("src/ConsumerLab/simpleReviewast.txt"));
	  System.out.println(Review.fakeReviewStronger("src/ConsumerLab/simpleReviewast.txt"));
	  
  }
}

 