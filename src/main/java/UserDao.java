import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

  public List<UserDto> getUserDtoList() {
    // DBから取得
    // ResultSetから取得
    List<UserDto> userDtos = new ArrayList<>();
    while (rs.next()) {
      String name = "";
      LocalDate birthday = null;
      String mailAddress = "";
      UserDto userDto = new UserDto(name, birthday, mailAddress);
      userDtos.add(userDto);
    }
    return userDtos;
  }
}
