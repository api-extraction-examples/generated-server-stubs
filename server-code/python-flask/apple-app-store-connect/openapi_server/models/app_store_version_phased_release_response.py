from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_phased_release import AppStoreVersionPhasedRelease
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.app_store_version_phased_release import AppStoreVersionPhasedRelease  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class AppStoreVersionPhasedReleaseResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreVersionPhasedReleaseResponse - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionPhasedReleaseResponse.  # noqa: E501
        :type data: AppStoreVersionPhasedRelease
        :param links: The links of this AppStoreVersionPhasedReleaseResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': AppStoreVersionPhasedRelease,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionPhasedReleaseResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionPhasedReleaseResponse of this AppStoreVersionPhasedReleaseResponse.  # noqa: E501
        :rtype: AppStoreVersionPhasedReleaseResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersionPhasedRelease:
        """Gets the data of this AppStoreVersionPhasedReleaseResponse.


        :return: The data of this AppStoreVersionPhasedReleaseResponse.
        :rtype: AppStoreVersionPhasedRelease
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersionPhasedRelease):
        """Sets the data of this AppStoreVersionPhasedReleaseResponse.


        :param data: The data of this AppStoreVersionPhasedReleaseResponse.
        :type data: AppStoreVersionPhasedRelease
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this AppStoreVersionPhasedReleaseResponse.


        :return: The links of this AppStoreVersionPhasedReleaseResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this AppStoreVersionPhasedReleaseResponse.


        :param links: The links of this AppStoreVersionPhasedReleaseResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links