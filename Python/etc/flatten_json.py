"""
In python code, given a json object with nested objects,
write a function that flattens all the objects to a single key value dictionary.
Do not use the lib that actually performs this function.

{ a:{b:c}}
{ a:{b:c,d:e} } becomes {a_b:c, a_d:e} ( not, a:"b:c,d:e" }
{ a:{b:{f:g},d:{h:i} }} becomes {a_b_f:g, a_d_h:i}

"""
def flatten_json(s):
    print(type(s))
    out = {}

    def flatten(x, name=''):
        if type(x) is dict:
            print('dict')
            for key in x:
                print('key : ' + key) # key
                print(x[key]) # value
                flatten(x[key], name = name + key + "_")
                print('name : ' + name)
        # elif type(x) is list:
        #     i = 0
        #     print('list')
        #     for key in x:
        #         flatten(x[key], name = name + key + "_")
        #         i += 1
        else:
            out[name[:-1]] = x

    flatten(s)
    return out

    # def flatten(d, parent_key='', sep='_'):
    #     items = []
    #     for k, v in d.items():
    #         new_key = parent_key + sep + k if parent_key else k
    #         if isinstance(v, collections.MutableMapping):
    #             items.extend(flatten(v, new_key, sep=sep).items())
    #         else:
    #             items.append((new_key, v))
    #     return dict(items)





if __name__ == '__main__':
    s = { "a":{"b":"c", "d":["e","f"]} }
    print(flatten_json(s))



