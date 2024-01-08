from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.scheduled_changes_feature_flag_conflict import ScheduledChangesFeatureFlagConflict
from openapi_server import util

from openapi_server.models.scheduled_changes_feature_flag_conflict import ScheduledChangesFeatureFlagConflict  # noqa: E501

class FeatureFlagScheduledChangesConflictsInstructionsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conflicts=None, kind=None):  # noqa: E501
        """FeatureFlagScheduledChangesConflictsInstructionsInner - a model defined in OpenAPI

        :param conflicts: The conflicts of this FeatureFlagScheduledChangesConflictsInstructionsInner.  # noqa: E501
        :type conflicts: List[ScheduledChangesFeatureFlagConflict]
        :param kind: The kind of this FeatureFlagScheduledChangesConflictsInstructionsInner.  # noqa: E501
        :type kind: str
        """
        self.openapi_types = {
            'conflicts': List[ScheduledChangesFeatureFlagConflict],
            'kind': str
        }

        self.attribute_map = {
            'conflicts': 'conflicts',
            'kind': 'kind'
        }

        self._conflicts = conflicts
        self._kind = kind

    @classmethod
    def from_dict(cls, dikt) -> 'FeatureFlagScheduledChangesConflictsInstructionsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeatureFlagScheduledChangesConflicts_instructions_inner of this FeatureFlagScheduledChangesConflictsInstructionsInner.  # noqa: E501
        :rtype: FeatureFlagScheduledChangesConflictsInstructionsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conflicts(self) -> List[ScheduledChangesFeatureFlagConflict]:
        """Gets the conflicts of this FeatureFlagScheduledChangesConflictsInstructionsInner.


        :return: The conflicts of this FeatureFlagScheduledChangesConflictsInstructionsInner.
        :rtype: List[ScheduledChangesFeatureFlagConflict]
        """
        return self._conflicts

    @conflicts.setter
    def conflicts(self, conflicts: List[ScheduledChangesFeatureFlagConflict]):
        """Sets the conflicts of this FeatureFlagScheduledChangesConflictsInstructionsInner.


        :param conflicts: The conflicts of this FeatureFlagScheduledChangesConflictsInstructionsInner.
        :type conflicts: List[ScheduledChangesFeatureFlagConflict]
        """

        self._conflicts = conflicts

    @property
    def kind(self) -> str:
        """Gets the kind of this FeatureFlagScheduledChangesConflictsInstructionsInner.

        The name of the modification you would like to perform on a resource.  # noqa: E501

        :return: The kind of this FeatureFlagScheduledChangesConflictsInstructionsInner.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind: str):
        """Sets the kind of this FeatureFlagScheduledChangesConflictsInstructionsInner.

        The name of the modification you would like to perform on a resource.  # noqa: E501

        :param kind: The kind of this FeatureFlagScheduledChangesConflictsInstructionsInner.
        :type kind: str
        """

        self._kind = kind
