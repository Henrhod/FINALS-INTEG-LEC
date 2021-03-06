# Python stubs generated by omniidl from Hangman.idl
# DO NOT EDIT THIS FILE!

import omniORB, _omnipy
from omniORB import CORBA, PortableServer
_0_CORBA = CORBA


_omnipy.checkVersion(4,2, __file__, 1)

try:
    property
except NameError:
    def property(*args):
        return None


#
# Start of module "Hangman"
#
__name__ = "Hangman"
_0_Hangman = omniORB.openModule("Hangman", r"Hangman.idl")
_0_Hangman__POA = omniORB.openModule("Hangman__POA", r"Hangman.idl")


# interface Hangman_Interface
_0_Hangman._d_Hangman_Interface = (omniORB.tcInternal.tv_objref, "IDL:Hangman/Hangman_Interface:1.0", "Hangman_Interface")
omniORB.typeMapping["IDL:Hangman/Hangman_Interface:1.0"] = _0_Hangman._d_Hangman_Interface
_0_Hangman.Hangman_Interface = omniORB.newEmptyClass()
class Hangman_Interface :
    _NP_RepositoryId = _0_Hangman._d_Hangman_Interface[1]

    def __init__(self, *args, **kw):
        raise RuntimeError("Cannot construct objects of this type.")

    _nil = CORBA.Object._nil


_0_Hangman.Hangman_Interface = Hangman_Interface
_0_Hangman._tc_Hangman_Interface = omniORB.tcInternal.createTypeCode(_0_Hangman._d_Hangman_Interface)
omniORB.registerType(Hangman_Interface._NP_RepositoryId, _0_Hangman._d_Hangman_Interface, _0_Hangman._tc_Hangman_Interface)

# Hangman_Interface operations and attributes
Hangman_Interface._d_login = (((omniORB.tcInternal.tv_string,0), ), (omniORB.tcInternal.tv_boolean, ), None)
Hangman_Interface._d_play = (((omniORB.tcInternal.tv_string,0), ), ((omniORB.tcInternal.tv_string,0), ), None)
Hangman_Interface._d_usedWord = (((omniORB.tcInternal.tv_string,0), (omniORB.tcInternal.tv_string,0)), (), None)
Hangman_Interface._d_logout = (((omniORB.tcInternal.tv_string,0), ), ((omniORB.tcInternal.tv_string,0), ), None)

# Hangman_Interface object reference
class _objref_Hangman_Interface (CORBA.Object):
    _NP_RepositoryId = Hangman_Interface._NP_RepositoryId

    def __init__(self, obj):
        CORBA.Object.__init__(self, obj)

    def login(self, *args):
        return self._obj.invoke("login", _0_Hangman.Hangman_Interface._d_login, args)

    def play(self, *args):
        return self._obj.invoke("play", _0_Hangman.Hangman_Interface._d_play, args)

    def usedWord(self, *args):
        return self._obj.invoke("usedWord", _0_Hangman.Hangman_Interface._d_usedWord, args)

    def logout(self, *args):
        return self._obj.invoke("logout", _0_Hangman.Hangman_Interface._d_logout, args)

omniORB.registerObjref(Hangman_Interface._NP_RepositoryId, _objref_Hangman_Interface)
_0_Hangman._objref_Hangman_Interface = _objref_Hangman_Interface
del Hangman_Interface, _objref_Hangman_Interface

# Hangman_Interface skeleton
__name__ = "Hangman__POA"
class Hangman_Interface (PortableServer.Servant):
    _NP_RepositoryId = _0_Hangman.Hangman_Interface._NP_RepositoryId


    _omni_op_d = {"login": _0_Hangman.Hangman_Interface._d_login, "play": _0_Hangman.Hangman_Interface._d_play, "usedWord": _0_Hangman.Hangman_Interface._d_usedWord, "logout": _0_Hangman.Hangman_Interface._d_logout}

Hangman_Interface._omni_skeleton = Hangman_Interface
_0_Hangman__POA.Hangman_Interface = Hangman_Interface
omniORB.registerSkeleton(Hangman_Interface._NP_RepositoryId, Hangman_Interface)
del Hangman_Interface
__name__ = "Hangman"

#
# End of module "Hangman"
#
__name__ = "Hangman_idl"

_exported_modules = ( "Hangman", )

# The end.
