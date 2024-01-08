from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedMusicGenre(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, key=None, title=None, type=None):  # noqa: E501
        """PersonalisedMusicGenre - a model defined in OpenAPI

        :param id: The id of this PersonalisedMusicGenre.  # noqa: E501
        :type id: str
        :param key: The key of this PersonalisedMusicGenre.  # noqa: E501
        :type key: str
        :param title: The title of this PersonalisedMusicGenre.  # noqa: E501
        :type title: str
        :param type: The type of this PersonalisedMusicGenre.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'id': str,
            'key': str,
            'title': str,
            'type': str
        }

        self.attribute_map = {
            'id': 'id',
            'key': 'key',
            'title': 'title',
            'type': 'type'
        }

        self._id = id
        self._key = key
        self._title = title
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicGenre':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicGenre of this PersonalisedMusicGenre.  # noqa: E501
        :rtype: PersonalisedMusicGenre
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this PersonalisedMusicGenre.


        :return: The id of this PersonalisedMusicGenre.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PersonalisedMusicGenre.


        :param id: The id of this PersonalisedMusicGenre.
        :type id: str
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this PersonalisedMusicGenre.


        :return: The key of this PersonalisedMusicGenre.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this PersonalisedMusicGenre.


        :param key: The key of this PersonalisedMusicGenre.
        :type key: str
        """

        self._key = key

    @property
    def title(self) -> str:
        """Gets the title of this PersonalisedMusicGenre.


        :return: The title of this PersonalisedMusicGenre.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PersonalisedMusicGenre.


        :param title: The title of this PersonalisedMusicGenre.
        :type title: str
        """

        self._title = title

    @property
    def type(self) -> str:
        """Gets the type of this PersonalisedMusicGenre.


        :return: The type of this PersonalisedMusicGenre.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PersonalisedMusicGenre.


        :param type: The type of this PersonalisedMusicGenre.
        :type type: str
        """

        self._type = type