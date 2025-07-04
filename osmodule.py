import os
print(os.getcwd())
os.chdir("C:\\KomalM\\Source\\Python_Program\\New folder") #create
print(os.getcwd())
os.mkdir("C:\\KomalM\\Source\\Python_Program\\Nkkkk")#make
os.rmdir("C:\\KomalM\\Source\\Python_Program\\Nkkkk") #remove
print(os.path.join("C:\\KomalM\\Source\\Python_Program" ,"C:\\KomalM\\Source\\Python_Program\\scrypting\\osmodule.py"))

print(os.path.split("C:\\KomalM\\Source\\Python_Program\\scrypting\\osmodule.py"))
print(os.path.exists("C:\\KomalM\\Source\\Python_Program\\scrypting\\osmodule.py"))