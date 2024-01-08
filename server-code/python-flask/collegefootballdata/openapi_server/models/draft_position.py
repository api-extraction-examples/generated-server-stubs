from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DraftPosition(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, abbreviation=None, name=None):  # noqa: E501
        """DraftPosition - a model defined in OpenAPI

        :param abbreviation: The abbreviation of this DraftPosition.  # noqa: E501
        :type abbreviation: str
        :param name: The name of this DraftPosition.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'abbreviation': str,
            'name': str
        }

        self.attribute_map = {
            'abbreviation': 'abbreviation',
            'name': 'name'
        }

        self._abbreviation = abbreviation
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'DraftPosition':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DraftPosition of this DraftPosition.  # noqa: E501
        :rtype: DraftPosition
        """
        return util.deserialize_model(dikt, cls)

    @property
    def abbreviation(self) -> str:
        """Gets the abbreviation of this DraftPosition.


        :return: The abbreviation of this DraftPosition.
        :rtype: str
        """
        return self._abbreviation

    @abbreviation.setter
    def abbreviation(self, abbreviation: str):
        """Sets the abbreviation of this DraftPosition.


        :param abbreviation: The abbreviation of this DraftPosition.
        :type abbreviation: str
        """

        self._abbreviation = abbreviation

    @property
    def name(self) -> str:
        """Gets the name of this DraftPosition.


        :return: The name of this DraftPosition.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DraftPosition.


        :param name: The name of this DraftPosition.
        :type name: str
        """

        self._name = name