from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_capability import BundleIdCapability
from openapi_server.models.document_links import DocumentLinks
from openapi_server import util

from openapi_server.models.bundle_id_capability import BundleIdCapability  # noqa: E501
from openapi_server.models.document_links import DocumentLinks  # noqa: E501

class BundleIdCapabilityResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """BundleIdCapabilityResponse - a model defined in OpenAPI

        :param data: The data of this BundleIdCapabilityResponse.  # noqa: E501
        :type data: BundleIdCapability
        :param links: The links of this BundleIdCapabilityResponse.  # noqa: E501
        :type links: DocumentLinks
        """
        self.openapi_types = {
            'data': BundleIdCapability,
            'links': DocumentLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCapabilityResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCapabilityResponse of this BundleIdCapabilityResponse.  # noqa: E501
        :rtype: BundleIdCapabilityResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BundleIdCapability:
        """Gets the data of this BundleIdCapabilityResponse.


        :return: The data of this BundleIdCapabilityResponse.
        :rtype: BundleIdCapability
        """
        return self._data

    @data.setter
    def data(self, data: BundleIdCapability):
        """Sets the data of this BundleIdCapabilityResponse.


        :param data: The data of this BundleIdCapabilityResponse.
        :type data: BundleIdCapability
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def links(self) -> DocumentLinks:
        """Gets the links of this BundleIdCapabilityResponse.


        :return: The links of this BundleIdCapabilityResponse.
        :rtype: DocumentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DocumentLinks):
        """Sets the links of this BundleIdCapabilityResponse.


        :param links: The links of this BundleIdCapabilityResponse.
        :type links: DocumentLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links
