class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        # work with local_name
        # split first with @, replace and split with others,
        # put into set to get uniques values
        result = []
        for email in emails:
            local_name = email.split('@')[0]
            local_name = local_name.replace('.', '')
            local_name = local_name.split('+')[0]
            email_address = local_name + '@' + email.split('@')[1]

            result.append(email_address)

        return len(set(result))



