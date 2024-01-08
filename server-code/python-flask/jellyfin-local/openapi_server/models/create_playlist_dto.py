from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreatePlaylistDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ids=None, media_type=None, name=None, user_id=None):  # noqa: E501
        """CreatePlaylistDto - a model defined in OpenAPI

        :param ids: The ids of this CreatePlaylistDto.  # noqa: E501
        :type ids: List[str]
        :param media_type: The media_type of this CreatePlaylistDto.  # noqa: E501
        :type media_type: str
        :param name: The name of this CreatePlaylistDto.  # noqa: E501
        :type name: str
        :param user_id: The user_id of this CreatePlaylistDto.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'ids': List[str],
            'media_type': str,
            'name': str,
            'user_id': str
        }

        self.attribute_map = {
            'ids': 'Ids',
            'media_type': 'MediaType',
            'name': 'Name',
            'user_id': 'UserId'
        }

        self._ids = ids
        self._media_type = media_type
        self._name = name
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'CreatePlaylistDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreatePlaylistDto of this CreatePlaylistDto.  # noqa: E501
        :rtype: CreatePlaylistDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ids(self) -> List[str]:
        """Gets the ids of this CreatePlaylistDto.

        Gets or sets item ids to add to the playlist.  # noqa: E501

        :return: The ids of this CreatePlaylistDto.
        :rtype: List[str]
        """
        return self._ids

    @ids.setter
    def ids(self, ids: List[str]):
        """Sets the ids of this CreatePlaylistDto.

        Gets or sets item ids to add to the playlist.  # noqa: E501

        :param ids: The ids of this CreatePlaylistDto.
        :type ids: List[str]
        """

        self._ids = ids

    @property
    def media_type(self) -> str:
        """Gets the media_type of this CreatePlaylistDto.

        Gets or sets the media type.  # noqa: E501

        :return: The media_type of this CreatePlaylistDto.
        :rtype: str
        """
        return self._media_type

    @media_type.setter
    def media_type(self, media_type: str):
        """Sets the media_type of this CreatePlaylistDto.

        Gets or sets the media type.  # noqa: E501

        :param media_type: The media_type of this CreatePlaylistDto.
        :type media_type: str
        """

        self._media_type = media_type

    @property
    def name(self) -> str:
        """Gets the name of this CreatePlaylistDto.

        Gets or sets the name of the new playlist.  # noqa: E501

        :return: The name of this CreatePlaylistDto.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreatePlaylistDto.

        Gets or sets the name of the new playlist.  # noqa: E501

        :param name: The name of this CreatePlaylistDto.
        :type name: str
        """

        self._name = name

    @property
    def user_id(self) -> str:
        """Gets the user_id of this CreatePlaylistDto.

        Gets or sets the user id.  # noqa: E501

        :return: The user_id of this CreatePlaylistDto.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this CreatePlaylistDto.

        Gets or sets the user id.  # noqa: E501

        :param user_id: The user_id of this CreatePlaylistDto.
        :type user_id: str
        """

        self._user_id = user_id