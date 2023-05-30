import java.time.LocalDate;

public class UserDto {

  public String getName() {
    return name;
  }

  public int calculateAge() {
    // birthdayから年齢を求めて返す
    return ;
  }

  public String getMailAddress() {
    return mailAddress;
  }

  private String name;
  private LocalDate birthday;
  private String mailAddress;

  public UserDto(String name, LocalDate birthday, String mailAddress) {
    this.name = name;
    this.birthday = birthday;
    this.mailAddress = mailAddress;
  }

  public UserDto() {}
}
