import java.util.List;

public class UserManager {

  public List<UserDto> getUsers() {

    return userDao.getUserDtoList();
  }
}
