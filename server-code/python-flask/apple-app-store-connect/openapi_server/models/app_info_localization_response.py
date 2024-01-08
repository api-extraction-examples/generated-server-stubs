from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info_localization import AppInfoLocalization
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.app_info_localization import AppInfoLocalization  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class AppInfoLocalizationResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppInfoLocalizationResponse - a model defined in OpenAPI

        :param data: The data of this AppInfoLocalizationResponse.  # noqa: E501
        :type data: AppInfoLocalization
        :param links: The links of this AppInfoLocalizationResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': AppInfoLocalization,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfoLocalizationResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfoLocalizationResponse of this AppInfoLocalizationResponse.  # noqa: E501
        :rtype: AppInfoLocalizationResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppInfoLocalization:
        """Gets the data of this AppInfoLocalizationResponse.


        :return: The data of this AppInfoLocalizationResponse.
        :rtype: AppInfoLocalization
        """
        return self._data

    @data.setter
    def data(self, data: AppInfoLocalization):
        """Sets the data of this AppInfoLocalizationResponse.


        :param data: The data of this AppInfoLocalizationResponse.
        :type data: AppInfoLocalization
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this AppInfoLocalizationResponse.


        :return: The links of this AppInfoLocalizationResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this AppInfoLocalizationResponse.


        :param links: The links of this AppInfoLocalizationResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links