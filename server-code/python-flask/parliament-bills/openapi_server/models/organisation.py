from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Organisation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, url=None):  # noqa: E501
        """Organisation - a model defined in OpenAPI

        :param name: The name of this Organisation.  # noqa: E501
        :type name: str
        :param url: The url of this Organisation.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'name': str,
            'url': str
        }

        self.attribute_map = {
            'name': 'name',
            'url': 'url'
        }

        self._name = name
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'Organisation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Organisation of this Organisation.  # noqa: E501
        :rtype: Organisation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this Organisation.


        :return: The name of this Organisation.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Organisation.


        :param name: The name of this Organisation.
        :type name: str
        """

        self._name = name

    @property
    def url(self) -> str:
        """Gets the url of this Organisation.


        :return: The url of this Organisation.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Organisation.


        :param url: The url of this Organisation.
        :type url: str
        """

        self._url = url
