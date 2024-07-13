# Simple Calculator Program

print("=== Calculator ===")
print("A simple calculator for single operation equations.")

first_num = float(input("\nEnter the first number: "))
second_num = float(input("Enter the second number: "))
print("1: + | 2: - | 3: * | 4: / | 5: // | 6: % | 7: **")
operator = int(input("Choose an operator: "))

match operator:
    case 1:
        answer = first_num + second_num
    case 2:
        answer = first_num - second_num
    case 3:
        answer = first_num * second_num
    case 4:
        answer = first_num / second_num
    case 5:
        answer = first_num // second_num
    case 6:
        answer = first_num % second_num
    case 7:
        answer = first_num ** second_num

print("Asnwer: " + str(answer))

