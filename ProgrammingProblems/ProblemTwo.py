def permute(a):
	if len(a) <= 1:
		return [a]
	q = []
	for i in range(len(a)):
		for j in permute(a[:i]+a[i+1:]):
			q += [a[i:i+1] + list(flatten(j))]
	return q

def path(arr):
	for i in permute((len(arr)-1)*['down']+(len(arr[0])-1)*['right']):
		x, y = 0, 0
		temp = []
		for j in range(len(i)):
			if(i[j] == 'down'):
				y += 1
			else:
				x += 1
			temp += [arr[y][x]]
		if not 1 in temp:
			return True
	return False
