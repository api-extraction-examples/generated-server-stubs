from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GeneralCommandType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    MOVEUP = 'MoveUp'
    MOVEDOWN = 'MoveDown'
    MOVELEFT = 'MoveLeft'
    MOVERIGHT = 'MoveRight'
    PAGEUP = 'PageUp'
    PAGEDOWN = 'PageDown'
    PREVIOUSLETTER = 'PreviousLetter'
    NEXTLETTER = 'NextLetter'
    TOGGLEOSD = 'ToggleOsd'
    TOGGLECONTEXTMENU = 'ToggleContextMenu'
    SELECT = 'Select'
    BACK = 'Back'
    TAKESCREENSHOT = 'TakeScreenshot'
    SENDKEY = 'SendKey'
    SENDSTRING = 'SendString'
    GOHOME = 'GoHome'
    GOTOSETTINGS = 'GoToSettings'
    VOLUMEUP = 'VolumeUp'
    VOLUMEDOWN = 'VolumeDown'
    MUTE = 'Mute'
    UNMUTE = 'Unmute'
    TOGGLEMUTE = 'ToggleMute'
    SETVOLUME = 'SetVolume'
    SETAUDIOSTREAMINDEX = 'SetAudioStreamIndex'
    SETSUBTITLESTREAMINDEX = 'SetSubtitleStreamIndex'
    TOGGLEFULLSCREEN = 'ToggleFullscreen'
    DISPLAYCONTENT = 'DisplayContent'
    GOTOSEARCH = 'GoToSearch'
    DISPLAYMESSAGE = 'DisplayMessage'
    SETREPEATMODE = 'SetRepeatMode'
    CHANNELUP = 'ChannelUp'
    CHANNELDOWN = 'ChannelDown'
    GUIDE = 'Guide'
    TOGGLESTATS = 'ToggleStats'
    PLAYMEDIASOURCE = 'PlayMediaSource'
    PLAYTRAILERS = 'PlayTrailers'
    SETSHUFFLEQUEUE = 'SetShuffleQueue'
    PLAYSTATE = 'PlayState'
    PLAYNEXT = 'PlayNext'
    TOGGLEOSDMENU = 'ToggleOsdMenu'
    PLAY = 'Play'
    def __init__(self):  # noqa: E501
        """GeneralCommandType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'GeneralCommandType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GeneralCommandType of this GeneralCommandType.  # noqa: E501
        :rtype: GeneralCommandType
        """
        return util.deserialize_model(dikt, cls)
