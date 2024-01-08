from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_instance_profile_response_instance_profile import CreateInstanceProfileResponseInstanceProfile
from openapi_server import util

from openapi_server.models.create_instance_profile_response_instance_profile import CreateInstanceProfileResponseInstanceProfile  # noqa: E501

class CreateInstanceProfileResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, instance_profile=None):  # noqa: E501
        """CreateInstanceProfileResponse - a model defined in OpenAPI

        :param instance_profile: The instance_profile of this CreateInstanceProfileResponse.  # noqa: E501
        :type instance_profile: CreateInstanceProfileResponseInstanceProfile
        """
        self.openapi_types = {
            'instance_profile': CreateInstanceProfileResponseInstanceProfile
        }

        self.attribute_map = {
            'instance_profile': 'InstanceProfile'
        }

        self._instance_profile = instance_profile

    @classmethod
    def from_dict(cls, dikt) -> 'CreateInstanceProfileResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateInstanceProfileResponse of this CreateInstanceProfileResponse.  # noqa: E501
        :rtype: CreateInstanceProfileResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def instance_profile(self) -> CreateInstanceProfileResponseInstanceProfile:
        """Gets the instance_profile of this CreateInstanceProfileResponse.


        :return: The instance_profile of this CreateInstanceProfileResponse.
        :rtype: CreateInstanceProfileResponseInstanceProfile
        """
        return self._instance_profile

    @instance_profile.setter
    def instance_profile(self, instance_profile: CreateInstanceProfileResponseInstanceProfile):
        """Sets the instance_profile of this CreateInstanceProfileResponse.


        :param instance_profile: The instance_profile of this CreateInstanceProfileResponse.
        :type instance_profile: CreateInstanceProfileResponseInstanceProfile
        """
        if instance_profile is None:
            raise ValueError("Invalid value for `instance_profile`, must not be `None`")  # noqa: E501

        self._instance_profile = instance_profile
