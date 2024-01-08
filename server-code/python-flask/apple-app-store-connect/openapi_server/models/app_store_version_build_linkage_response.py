from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.app_relationships_builds_data_inner import AppRelationshipsBuildsDataInner  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class AppStoreVersionBuildLinkageResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreVersionBuildLinkageResponse - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionBuildLinkageResponse.  # noqa: E501
        :type data: AppRelationshipsBuildsDataInner
        :param links: The links of this AppStoreVersionBuildLinkageResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': AppRelationshipsBuildsDataInner,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionBuildLinkageResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionBuildLinkageResponse of this AppStoreVersionBuildLinkageResponse.  # noqa: E501
        :rtype: AppStoreVersionBuildLinkageResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppRelationshipsBuildsDataInner:
        """Gets the data of this AppStoreVersionBuildLinkageResponse.


        :return: The data of this AppStoreVersionBuildLinkageResponse.
        :rtype: AppRelationshipsBuildsDataInner
        """
        return self._data

    @data.setter
    def data(self, data: AppRelationshipsBuildsDataInner):
        """Sets the data of this AppStoreVersionBuildLinkageResponse.


        :param data: The data of this AppStoreVersionBuildLinkageResponse.
        :type data: AppRelationshipsBuildsDataInner
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this AppStoreVersionBuildLinkageResponse.


        :return: The links of this AppStoreVersionBuildLinkageResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this AppStoreVersionBuildLinkageResponse.


        :param links: The links of this AppStoreVersionBuildLinkageResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
