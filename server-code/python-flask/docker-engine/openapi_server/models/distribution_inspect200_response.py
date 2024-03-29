from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.distribution_inspect200_response_descriptor import DistributionInspect200ResponseDescriptor
from openapi_server.models.distribution_inspect200_response_platforms_inner import DistributionInspect200ResponsePlatformsInner
from openapi_server import util

from openapi_server.models.distribution_inspect200_response_descriptor import DistributionInspect200ResponseDescriptor  # noqa: E501
from openapi_server.models.distribution_inspect200_response_platforms_inner import DistributionInspect200ResponsePlatformsInner  # noqa: E501

class DistributionInspect200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, descriptor=None, platforms=None):  # noqa: E501
        """DistributionInspect200Response - a model defined in OpenAPI

        :param descriptor: The descriptor of this DistributionInspect200Response.  # noqa: E501
        :type descriptor: DistributionInspect200ResponseDescriptor
        :param platforms: The platforms of this DistributionInspect200Response.  # noqa: E501
        :type platforms: List[DistributionInspect200ResponsePlatformsInner]
        """
        self.openapi_types = {
            'descriptor': DistributionInspect200ResponseDescriptor,
            'platforms': List[DistributionInspect200ResponsePlatformsInner]
        }

        self.attribute_map = {
            'descriptor': 'Descriptor',
            'platforms': 'Platforms'
        }

        self._descriptor = descriptor
        self._platforms = platforms

    @classmethod
    def from_dict(cls, dikt) -> 'DistributionInspect200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DistributionInspect_200_response of this DistributionInspect200Response.  # noqa: E501
        :rtype: DistributionInspect200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def descriptor(self) -> DistributionInspect200ResponseDescriptor:
        """Gets the descriptor of this DistributionInspect200Response.


        :return: The descriptor of this DistributionInspect200Response.
        :rtype: DistributionInspect200ResponseDescriptor
        """
        return self._descriptor

    @descriptor.setter
    def descriptor(self, descriptor: DistributionInspect200ResponseDescriptor):
        """Sets the descriptor of this DistributionInspect200Response.


        :param descriptor: The descriptor of this DistributionInspect200Response.
        :type descriptor: DistributionInspect200ResponseDescriptor
        """
        if descriptor is None:
            raise ValueError("Invalid value for `descriptor`, must not be `None`")  # noqa: E501

        self._descriptor = descriptor

    @property
    def platforms(self) -> List[DistributionInspect200ResponsePlatformsInner]:
        """Gets the platforms of this DistributionInspect200Response.

        An array containing all platforms supported by the image  # noqa: E501

        :return: The platforms of this DistributionInspect200Response.
        :rtype: List[DistributionInspect200ResponsePlatformsInner]
        """
        return self._platforms

    @platforms.setter
    def platforms(self, platforms: List[DistributionInspect200ResponsePlatformsInner]):
        """Sets the platforms of this DistributionInspect200Response.

        An array containing all platforms supported by the image  # noqa: E501

        :param platforms: The platforms of this DistributionInspect200Response.
        :type platforms: List[DistributionInspect200ResponsePlatformsInner]
        """
        if platforms is None:
            raise ValueError("Invalid value for `platforms`, must not be `None`")  # noqa: E501

        self._platforms = platforms
