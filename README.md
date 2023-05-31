# SI_2023_lab2_213096
Славчо Карафиловски 213096

# Control Flow Graph
![diagram](https://github.com/slavcho-k/SI_2023_lab2_213096/assets/107281167/3f69885d-cab5-4d6a-b7c1-92d7611a52a3)

# Цикломатската комплексност
CK = E - N + 2
CK = Цикломатска комплексност
E = број на ебра
N = број на јазли
Цикломатската комплекност на графот е 11. Ја добив така што вкупниот број на ребра го одзедов од бројот на јазли (36-27) во случајов и додадов 2 

# Тестови според критериумот Every branch
1. Testcase кога некој од user, user.getPassword() или user.getEmail() == null, се очекува да се фрли Runtime Exception со соодветната порака.
2. Testcase кога user.getUsername() == null, се користи setter-от на класата user за да се постави соодветно корисничко име.
3. Testcase кога email содржи '@' и '.', и во листата на корисници има повеќе од 1 user и има дупликати по username и email, резултат се зголемува променливата same за 1.
4. Testcase кога password-от го содржи username-от или пак password-от е пократок од 8 карактери, функцијата враќа false.

# Тест случаеви според Multiple Condition критериумот за условот if (user==null || user.getPassword()==null || user.getEmail()==null)
Било кој од бараните user, user.getPassword() и user.getEmail() да е null и ниеден од нив да не е null.

# Објаснување за UNIT тестовите




