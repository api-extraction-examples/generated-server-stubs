from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.phased_release_state import PhasedReleaseState
from openapi_server import util

from openapi_server.models.phased_release_state import PhasedReleaseState  # noqa: E501

class AppStoreVersionPhasedReleaseCreateRequestDataAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, phased_release_state=None):  # noqa: E501
        """AppStoreVersionPhasedReleaseCreateRequestDataAttributes - a model defined in OpenAPI

        :param phased_release_state: The phased_release_state of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.  # noqa: E501
        :type phased_release_state: PhasedReleaseState
        """
        self.openapi_types = {
            'phased_release_state': PhasedReleaseState
        }

        self.attribute_map = {
            'phased_release_state': 'phasedReleaseState'
        }

        self._phased_release_state = phased_release_state

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionPhasedReleaseCreateRequestDataAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionPhasedReleaseCreateRequest_data_attributes of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.  # noqa: E501
        :rtype: AppStoreVersionPhasedReleaseCreateRequestDataAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def phased_release_state(self) -> PhasedReleaseState:
        """Gets the phased_release_state of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.


        :return: The phased_release_state of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.
        :rtype: PhasedReleaseState
        """
        return self._phased_release_state

    @phased_release_state.setter
    def phased_release_state(self, phased_release_state: PhasedReleaseState):
        """Sets the phased_release_state of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.


        :param phased_release_state: The phased_release_state of this AppStoreVersionPhasedReleaseCreateRequestDataAttributes.
        :type phased_release_state: PhasedReleaseState
        """

        self._phased_release_state = phased_release_state
