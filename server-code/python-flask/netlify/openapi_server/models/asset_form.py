from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AssetForm(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, fields=None, url=None):  # noqa: E501
        """AssetForm - a model defined in OpenAPI

        :param fields: The fields of this AssetForm.  # noqa: E501
        :type fields: Dict[str, str]
        :param url: The url of this AssetForm.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'fields': Dict[str, str],
            'url': str
        }

        self.attribute_map = {
            'fields': 'fields',
            'url': 'url'
        }

        self._fields = fields
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'AssetForm':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The assetForm of this AssetForm.  # noqa: E501
        :rtype: AssetForm
        """
        return util.deserialize_model(dikt, cls)

    @property
    def fields(self) -> Dict[str, str]:
        """Gets the fields of this AssetForm.


        :return: The fields of this AssetForm.
        :rtype: Dict[str, str]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: Dict[str, str]):
        """Sets the fields of this AssetForm.


        :param fields: The fields of this AssetForm.
        :type fields: Dict[str, str]
        """

        self._fields = fields

    @property
    def url(self) -> str:
        """Gets the url of this AssetForm.


        :return: The url of this AssetForm.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this AssetForm.


        :param url: The url of this AssetForm.
        :type url: str
        """

        self._url = url
