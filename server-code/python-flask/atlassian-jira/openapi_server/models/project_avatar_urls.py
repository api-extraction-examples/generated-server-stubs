from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectAvatarUrls(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _16x16=None, _24x24=None, _32x32=None, _48x48=None):  # noqa: E501
        """ProjectAvatarUrls - a model defined in OpenAPI

        :param _16x16: The _16x16 of this ProjectAvatarUrls.  # noqa: E501
        :type _16x16: str
        :param _24x24: The _24x24 of this ProjectAvatarUrls.  # noqa: E501
        :type _24x24: str
        :param _32x32: The _32x32 of this ProjectAvatarUrls.  # noqa: E501
        :type _32x32: str
        :param _48x48: The _48x48 of this ProjectAvatarUrls.  # noqa: E501
        :type _48x48: str
        """
        self.openapi_types = {
            '_16x16': str,
            '_24x24': str,
            '_32x32': str,
            '_48x48': str
        }

        self.attribute_map = {
            '_16x16': '16x16',
            '_24x24': '24x24',
            '_32x32': '32x32',
            '_48x48': '48x48'
        }

        self.__16x16 = _16x16
        self.__24x24 = _24x24
        self.__32x32 = _32x32
        self.__48x48 = _48x48

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectAvatarUrls':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Project_avatarUrls of this ProjectAvatarUrls.  # noqa: E501
        :rtype: ProjectAvatarUrls
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _16x16(self) -> str:
        """Gets the _16x16 of this ProjectAvatarUrls.

        The URL of the item's 16x16 pixel avatar.  # noqa: E501

        :return: The _16x16 of this ProjectAvatarUrls.
        :rtype: str
        """
        return self.__16x16

    @_16x16.setter
    def _16x16(self, _16x16: str):
        """Sets the _16x16 of this ProjectAvatarUrls.

        The URL of the item's 16x16 pixel avatar.  # noqa: E501

        :param _16x16: The _16x16 of this ProjectAvatarUrls.
        :type _16x16: str
        """

        self.__16x16 = _16x16

    @property
    def _24x24(self) -> str:
        """Gets the _24x24 of this ProjectAvatarUrls.

        The URL of the item's 24x24 pixel avatar.  # noqa: E501

        :return: The _24x24 of this ProjectAvatarUrls.
        :rtype: str
        """
        return self.__24x24

    @_24x24.setter
    def _24x24(self, _24x24: str):
        """Sets the _24x24 of this ProjectAvatarUrls.

        The URL of the item's 24x24 pixel avatar.  # noqa: E501

        :param _24x24: The _24x24 of this ProjectAvatarUrls.
        :type _24x24: str
        """

        self.__24x24 = _24x24

    @property
    def _32x32(self) -> str:
        """Gets the _32x32 of this ProjectAvatarUrls.

        The URL of the item's 32x32 pixel avatar.  # noqa: E501

        :return: The _32x32 of this ProjectAvatarUrls.
        :rtype: str
        """
        return self.__32x32

    @_32x32.setter
    def _32x32(self, _32x32: str):
        """Sets the _32x32 of this ProjectAvatarUrls.

        The URL of the item's 32x32 pixel avatar.  # noqa: E501

        :param _32x32: The _32x32 of this ProjectAvatarUrls.
        :type _32x32: str
        """

        self.__32x32 = _32x32

    @property
    def _48x48(self) -> str:
        """Gets the _48x48 of this ProjectAvatarUrls.

        The URL of the item's 48x48 pixel avatar.  # noqa: E501

        :return: The _48x48 of this ProjectAvatarUrls.
        :rtype: str
        """
        return self.__48x48

    @_48x48.setter
    def _48x48(self, _48x48: str):
        """Sets the _48x48 of this ProjectAvatarUrls.

        The URL of the item's 48x48 pixel avatar.  # noqa: E501

        :param _48x48: The _48x48 of this ProjectAvatarUrls.
        :type _48x48: str
        """

        self.__48x48 = _48x48
