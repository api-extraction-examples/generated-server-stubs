from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UpdateTaskInstance(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dry_run=False, new_state=None):  # noqa: E501
        """UpdateTaskInstance - a model defined in OpenAPI

        :param dry_run: The dry_run of this UpdateTaskInstance.  # noqa: E501
        :type dry_run: bool
        :param new_state: The new_state of this UpdateTaskInstance.  # noqa: E501
        :type new_state: str
        """
        self.openapi_types = {
            'dry_run': bool,
            'new_state': str
        }

        self.attribute_map = {
            'dry_run': 'dry_run',
            'new_state': 'new_state'
        }

        self._dry_run = dry_run
        self._new_state = new_state

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateTaskInstance':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateTaskInstance of this UpdateTaskInstance.  # noqa: E501
        :rtype: UpdateTaskInstance
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dry_run(self) -> bool:
        """Gets the dry_run of this UpdateTaskInstance.

        If set, don't actually run this operation. The response will contain the task instance planned to be affected, but won't be modified in any way.   # noqa: E501

        :return: The dry_run of this UpdateTaskInstance.
        :rtype: bool
        """
        return self._dry_run

    @dry_run.setter
    def dry_run(self, dry_run: bool):
        """Sets the dry_run of this UpdateTaskInstance.

        If set, don't actually run this operation. The response will contain the task instance planned to be affected, but won't be modified in any way.   # noqa: E501

        :param dry_run: The dry_run of this UpdateTaskInstance.
        :type dry_run: bool
        """

        self._dry_run = dry_run

    @property
    def new_state(self) -> str:
        """Gets the new_state of this UpdateTaskInstance.

        Expected new state.  # noqa: E501

        :return: The new_state of this UpdateTaskInstance.
        :rtype: str
        """
        return self._new_state

    @new_state.setter
    def new_state(self, new_state: str):
        """Sets the new_state of this UpdateTaskInstance.

        Expected new state.  # noqa: E501

        :param new_state: The new_state of this UpdateTaskInstance.
        :type new_state: str
        """
        allowed_values = ["success", "failed"]  # noqa: E501
        if new_state not in allowed_values:
            raise ValueError(
                "Invalid value for `new_state` ({0}), must be one of {1}"
                .format(new_state, allowed_values)
            )

        self._new_state = new_state
