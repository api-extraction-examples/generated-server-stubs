from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.platform import Platform
from openapi_server.models.task_spec_placement_preferences_inner import TaskSpecPlacementPreferencesInner
from openapi_server import util

from openapi_server.models.platform import Platform  # noqa: E501
from openapi_server.models.task_spec_placement_preferences_inner import TaskSpecPlacementPreferencesInner  # noqa: E501

class TaskSpecPlacement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, constraints=None, platforms=None, preferences=None):  # noqa: E501
        """TaskSpecPlacement - a model defined in OpenAPI

        :param constraints: The constraints of this TaskSpecPlacement.  # noqa: E501
        :type constraints: List[str]
        :param platforms: The platforms of this TaskSpecPlacement.  # noqa: E501
        :type platforms: List[Platform]
        :param preferences: The preferences of this TaskSpecPlacement.  # noqa: E501
        :type preferences: List[TaskSpecPlacementPreferencesInner]
        """
        self.openapi_types = {
            'constraints': List[str],
            'platforms': List[Platform],
            'preferences': List[TaskSpecPlacementPreferencesInner]
        }

        self.attribute_map = {
            'constraints': 'Constraints',
            'platforms': 'Platforms',
            'preferences': 'Preferences'
        }

        self._constraints = constraints
        self._platforms = platforms
        self._preferences = preferences

    @classmethod
    def from_dict(cls, dikt) -> 'TaskSpecPlacement':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskSpec_Placement of this TaskSpecPlacement.  # noqa: E501
        :rtype: TaskSpecPlacement
        """
        return util.deserialize_model(dikt, cls)

    @property
    def constraints(self) -> List[str]:
        """Gets the constraints of this TaskSpecPlacement.

        An array of constraints.  # noqa: E501

        :return: The constraints of this TaskSpecPlacement.
        :rtype: List[str]
        """
        return self._constraints

    @constraints.setter
    def constraints(self, constraints: List[str]):
        """Sets the constraints of this TaskSpecPlacement.

        An array of constraints.  # noqa: E501

        :param constraints: The constraints of this TaskSpecPlacement.
        :type constraints: List[str]
        """

        self._constraints = constraints

    @property
    def platforms(self) -> List[Platform]:
        """Gets the platforms of this TaskSpecPlacement.

        Platforms stores all the platforms that the service's image can run on. This field is used in the platform filter for scheduling. If empty, then the platform filter is off, meaning there are no scheduling restrictions.   # noqa: E501

        :return: The platforms of this TaskSpecPlacement.
        :rtype: List[Platform]
        """
        return self._platforms

    @platforms.setter
    def platforms(self, platforms: List[Platform]):
        """Sets the platforms of this TaskSpecPlacement.

        Platforms stores all the platforms that the service's image can run on. This field is used in the platform filter for scheduling. If empty, then the platform filter is off, meaning there are no scheduling restrictions.   # noqa: E501

        :param platforms: The platforms of this TaskSpecPlacement.
        :type platforms: List[Platform]
        """

        self._platforms = platforms

    @property
    def preferences(self) -> List[TaskSpecPlacementPreferencesInner]:
        """Gets the preferences of this TaskSpecPlacement.

        Preferences provide a way to make the scheduler aware of factors such as topology. They are provided in order from highest to lowest precedence.  # noqa: E501

        :return: The preferences of this TaskSpecPlacement.
        :rtype: List[TaskSpecPlacementPreferencesInner]
        """
        return self._preferences

    @preferences.setter
    def preferences(self, preferences: List[TaskSpecPlacementPreferencesInner]):
        """Sets the preferences of this TaskSpecPlacement.

        Preferences provide a way to make the scheduler aware of factors such as topology. They are provided in order from highest to lowest precedence.  # noqa: E501

        :param preferences: The preferences of this TaskSpecPlacement.
        :type preferences: List[TaskSpecPlacementPreferencesInner]
        """

        self._preferences = preferences
