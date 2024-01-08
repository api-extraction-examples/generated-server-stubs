from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PlayType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, abbreviation=None, id=None, text=None):  # noqa: E501
        """PlayType - a model defined in OpenAPI

        :param abbreviation: The abbreviation of this PlayType.  # noqa: E501
        :type abbreviation: str
        :param id: The id of this PlayType.  # noqa: E501
        :type id: int
        :param text: The text of this PlayType.  # noqa: E501
        :type text: str
        """
        self.openapi_types = {
            'abbreviation': str,
            'id': int,
            'text': str
        }

        self.attribute_map = {
            'abbreviation': 'abbreviation',
            'id': 'id',
            'text': 'text'
        }

        self._abbreviation = abbreviation
        self._id = id
        self._text = text

    @classmethod
    def from_dict(cls, dikt) -> 'PlayType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayType of this PlayType.  # noqa: E501
        :rtype: PlayType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def abbreviation(self) -> str:
        """Gets the abbreviation of this PlayType.


        :return: The abbreviation of this PlayType.
        :rtype: str
        """
        return self._abbreviation

    @abbreviation.setter
    def abbreviation(self, abbreviation: str):
        """Sets the abbreviation of this PlayType.


        :param abbreviation: The abbreviation of this PlayType.
        :type abbreviation: str
        """

        self._abbreviation = abbreviation

    @property
    def id(self) -> int:
        """Gets the id of this PlayType.


        :return: The id of this PlayType.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this PlayType.


        :param id: The id of this PlayType.
        :type id: int
        """

        self._id = id

    @property
    def text(self) -> str:
        """Gets the text of this PlayType.


        :return: The text of this PlayType.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this PlayType.


        :param text: The text of this PlayType.
        :type text: str
        """

        self._text = text
