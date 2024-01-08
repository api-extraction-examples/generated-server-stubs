from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedMusicImage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, format=None, id=None, type=None):  # noqa: E501
        """PersonalisedMusicImage - a model defined in OpenAPI

        :param format: The format of this PersonalisedMusicImage.  # noqa: E501
        :type format: str
        :param id: The id of this PersonalisedMusicImage.  # noqa: E501
        :type id: str
        :param type: The type of this PersonalisedMusicImage.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'format': str,
            'id': str,
            'type': str
        }

        self.attribute_map = {
            'format': 'format',
            'id': 'id',
            'type': 'type'
        }

        self._format = format
        self._id = id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicImage':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicImage of this PersonalisedMusicImage.  # noqa: E501
        :rtype: PersonalisedMusicImage
        """
        return util.deserialize_model(dikt, cls)

    @property
    def format(self) -> str:
        """Gets the format of this PersonalisedMusicImage.


        :return: The format of this PersonalisedMusicImage.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format: str):
        """Sets the format of this PersonalisedMusicImage.


        :param format: The format of this PersonalisedMusicImage.
        :type format: str
        """

        self._format = format

    @property
    def id(self) -> str:
        """Gets the id of this PersonalisedMusicImage.


        :return: The id of this PersonalisedMusicImage.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PersonalisedMusicImage.


        :param id: The id of this PersonalisedMusicImage.
        :type id: str
        """

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this PersonalisedMusicImage.


        :return: The type of this PersonalisedMusicImage.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PersonalisedMusicImage.


        :param type: The type of this PersonalisedMusicImage.
        :type type: str
        """

        self._type = type
