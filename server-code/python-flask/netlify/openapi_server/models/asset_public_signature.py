from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AssetPublicSignature(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, url=None):  # noqa: E501
        """AssetPublicSignature - a model defined in OpenAPI

        :param url: The url of this AssetPublicSignature.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'url': str
        }

        self.attribute_map = {
            'url': 'url'
        }

        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'AssetPublicSignature':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The assetPublicSignature of this AssetPublicSignature.  # noqa: E501
        :rtype: AssetPublicSignature
        """
        return util.deserialize_model(dikt, cls)

    @property
    def url(self) -> str:
        """Gets the url of this AssetPublicSignature.


        :return: The url of this AssetPublicSignature.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this AssetPublicSignature.


        :param url: The url of this AssetPublicSignature.
        :type url: str
        """

        self._url = url