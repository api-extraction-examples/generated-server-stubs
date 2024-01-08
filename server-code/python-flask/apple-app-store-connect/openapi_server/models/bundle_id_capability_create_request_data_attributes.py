from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.capability_setting import CapabilitySetting
from openapi_server.models.capability_type import CapabilityType
from openapi_server import util

from openapi_server.models.capability_setting import CapabilitySetting  # noqa: E501
from openapi_server.models.capability_type import CapabilityType  # noqa: E501

class BundleIdCapabilityCreateRequestDataAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, capability_type=None, settings=None):  # noqa: E501
        """BundleIdCapabilityCreateRequestDataAttributes - a model defined in OpenAPI

        :param capability_type: The capability_type of this BundleIdCapabilityCreateRequestDataAttributes.  # noqa: E501
        :type capability_type: CapabilityType
        :param settings: The settings of this BundleIdCapabilityCreateRequestDataAttributes.  # noqa: E501
        :type settings: List[CapabilitySetting]
        """
        self.openapi_types = {
            'capability_type': CapabilityType,
            'settings': List[CapabilitySetting]
        }

        self.attribute_map = {
            'capability_type': 'capabilityType',
            'settings': 'settings'
        }

        self._capability_type = capability_type
        self._settings = settings

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCapabilityCreateRequestDataAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCapabilityCreateRequest_data_attributes of this BundleIdCapabilityCreateRequestDataAttributes.  # noqa: E501
        :rtype: BundleIdCapabilityCreateRequestDataAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def capability_type(self) -> CapabilityType:
        """Gets the capability_type of this BundleIdCapabilityCreateRequestDataAttributes.


        :return: The capability_type of this BundleIdCapabilityCreateRequestDataAttributes.
        :rtype: CapabilityType
        """
        return self._capability_type

    @capability_type.setter
    def capability_type(self, capability_type: CapabilityType):
        """Sets the capability_type of this BundleIdCapabilityCreateRequestDataAttributes.


        :param capability_type: The capability_type of this BundleIdCapabilityCreateRequestDataAttributes.
        :type capability_type: CapabilityType
        """
        if capability_type is None:
            raise ValueError("Invalid value for `capability_type`, must not be `None`")  # noqa: E501

        self._capability_type = capability_type

    @property
    def settings(self) -> List[CapabilitySetting]:
        """Gets the settings of this BundleIdCapabilityCreateRequestDataAttributes.


        :return: The settings of this BundleIdCapabilityCreateRequestDataAttributes.
        :rtype: List[CapabilitySetting]
        """
        return self._settings

    @settings.setter
    def settings(self, settings: List[CapabilitySetting]):
        """Sets the settings of this BundleIdCapabilityCreateRequestDataAttributes.


        :param settings: The settings of this BundleIdCapabilityCreateRequestDataAttributes.
        :type settings: List[CapabilitySetting]
        """

        self._settings = settings
