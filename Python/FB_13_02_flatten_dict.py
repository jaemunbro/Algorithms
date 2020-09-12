# more than 2 level
# for loop + recursive
nd = {'geeks':
                {'Geeks':
                        {'for': 7}},
      'for':
            {'geeks':
                        {'Geeks': 3}},
      'Geeks':
                {'for':
                        {'for': 1, 'geeks': 4}
                },
      'last' : 3
      }
fd = {}

def flatten_dict(k, v, fd):
    if isinstance(v, dict):
        for sub_k,sub_v in v.items():
            sub_k = k + '_' + sub_k
            flatten_dict(sub_k, sub_v, fd)
    else:
        fd[k] = v


for k,v in nd.items():
    flatten_dict(k, v, fd)

print(fd)
