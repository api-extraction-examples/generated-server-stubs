from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListServerCertificateTagsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, tags=None, is_truncated=None, marker=None):  # noqa: E501
        """ListServerCertificateTagsResponse - a model defined in OpenAPI

        :param tags: The tags of this ListServerCertificateTagsResponse.  # noqa: E501
        :type tags: List
        :param is_truncated: The is_truncated of this ListServerCertificateTagsResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListServerCertificateTagsResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'tags': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'tags': 'Tags',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._tags = tags
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListServerCertificateTagsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListServerCertificateTagsResponse of this ListServerCertificateTagsResponse.  # noqa: E501
        :rtype: ListServerCertificateTagsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def tags(self) -> List:
        """Gets the tags of this ListServerCertificateTagsResponse.


        :return: The tags of this ListServerCertificateTagsResponse.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this ListServerCertificateTagsResponse.


        :param tags: The tags of this ListServerCertificateTagsResponse.
        :type tags: List
        """
        if tags is None:
            raise ValueError("Invalid value for `tags`, must not be `None`")  # noqa: E501

        self._tags = tags

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListServerCertificateTagsResponse.


        :return: The is_truncated of this ListServerCertificateTagsResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListServerCertificateTagsResponse.


        :param is_truncated: The is_truncated of this ListServerCertificateTagsResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListServerCertificateTagsResponse.


        :return: The marker of this ListServerCertificateTagsResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListServerCertificateTagsResponse.


        :param marker: The marker of this ListServerCertificateTagsResponse.
        :type marker: str
        """

        self._marker = marker
