from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectFeatureState(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, state=None):  # noqa: E501
        """ProjectFeatureState - a model defined in OpenAPI

        :param state: The state of this ProjectFeatureState.  # noqa: E501
        :type state: str
        """
        self.openapi_types = {
            'state': str
        }

        self.attribute_map = {
            'state': 'state'
        }

        self._state = state

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectFeatureState':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectFeatureState of this ProjectFeatureState.  # noqa: E501
        :rtype: ProjectFeatureState
        """
        return util.deserialize_model(dikt, cls)

    @property
    def state(self) -> str:
        """Gets the state of this ProjectFeatureState.

        The feature state.  # noqa: E501

        :return: The state of this ProjectFeatureState.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this ProjectFeatureState.

        The feature state.  # noqa: E501

        :param state: The state of this ProjectFeatureState.
        :type state: str
        """
        allowed_values = ["ENABLED", "DISABLED", "COMING_SOON"]  # noqa: E501
        if state not in allowed_values:
            raise ValueError(
                "Invalid value for `state` ({0}), must be one of {1}"
                .format(state, allowed_values)
            )

        self._state = state
