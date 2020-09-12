import re

# first I've come up with a mixed solution with regex and divide and conquer
class Solution:
    def validIPv4(self, IP):
        match = re.match("^\d{1,3}\.\d{1,3}.\d{1,3}.\d{1,3}$", IP)
        # 1~3 digit numbers are gauranteed
        if not match:
            return False

        ip_list_int = list(map(int, IP.split('.')))
        ip_list_str = list(IP.split('.'))

        if len(ip_list_int) != 4:
            return False

        for i in range(len(ip_list_int)):
            # 0~255
            if ip_list_int[i] > 255 or ip_list_int[i] < 0:
                return False

            # leading by 0
            if str(ip_list_int[i]) != ip_list_str[i]:
                return False

        return True

    def validIPv6(self, IP):
        match = re.match("^(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}\:(\d|[A-F]|[a-f]){1,4}$", IP)
        # numbers and a-f alphabets are gauranteed
        if not match:
            return False
        return True


    def validIPAddress(self, IP: str) -> str:
        iptype = ''
        result = False

        if ':' in IP:
            result = self.validIPv6(IP)
            iptype = 'IPv6'
        else:
            result = self.validIPv4(IP)
            iptype = 'IPv4'

        if result:
            return iptype
        else:
            return 'Neither'


# regex
# can be solved with only regex, for example:
ip = '33.33.11.222'
ipv4chunk = r'([0]|[0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])'
match = re.match(r'^(' + ipv4chunk + r'\.){3}' + ipv4chunk + r'$', ip)
print(match)




