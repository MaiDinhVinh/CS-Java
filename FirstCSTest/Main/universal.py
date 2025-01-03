#Ex 1

# def AscendingDigits(a, b ,c): 
# 	str_a = str(a)
# 	str_b = str(b)
# 	str_c = str(c)
# 	try:
# 		num_list = [str_a[-3], str_b[-3], str_c[-3]]
# 		print("The integers are: " + str_a + ", " + str_b + " and " + str_c)
# 		if num_list[0] < num_list[1] and num_list[1] < num_list[2]:
# 			return "Yes"
# 		else: 
# 			return "No"
# 	except IndexError:
# 		print("The integers are: " + str_a + ", " + str_b + " and " + str_c)
# 		return "No"

#Ex 3
def greatestSum(arr):
	great = 0
	cache = 0
	false_val = arr[len(arr)-1] + arr[len(arr)-1]
	for i in range(len(arr)):
		for num in range(len(arr)-1):  
			if arr[i] + arr[num+1] > great and arr[i] + arr[num+1] != false_val:
				great = arr[i] + arr[num+1]
	return("the greatest sum is " + str(great)) 
print(greatestSum([37, 13, 37, 10, 9]))