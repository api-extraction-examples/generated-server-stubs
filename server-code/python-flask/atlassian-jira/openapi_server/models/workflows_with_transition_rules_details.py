from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.workflow_transition_rules_details import WorkflowTransitionRulesDetails
from openapi_server import util

from openapi_server.models.workflow_transition_rules_details import WorkflowTransitionRulesDetails  # noqa: E501

class WorkflowsWithTransitionRulesDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, workflows=None):  # noqa: E501
        """WorkflowsWithTransitionRulesDetails - a model defined in OpenAPI

        :param workflows: The workflows of this WorkflowsWithTransitionRulesDetails.  # noqa: E501
        :type workflows: List[WorkflowTransitionRulesDetails]
        """
        self.openapi_types = {
            'workflows': List[WorkflowTransitionRulesDetails]
        }

        self.attribute_map = {
            'workflows': 'workflows'
        }

        self._workflows = workflows

    @classmethod
    def from_dict(cls, dikt) -> 'WorkflowsWithTransitionRulesDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkflowsWithTransitionRulesDetails of this WorkflowsWithTransitionRulesDetails.  # noqa: E501
        :rtype: WorkflowsWithTransitionRulesDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def workflows(self) -> List[WorkflowTransitionRulesDetails]:
        """Gets the workflows of this WorkflowsWithTransitionRulesDetails.

        The list of workflows with transition rules to delete.  # noqa: E501

        :return: The workflows of this WorkflowsWithTransitionRulesDetails.
        :rtype: List[WorkflowTransitionRulesDetails]
        """
        return self._workflows

    @workflows.setter
    def workflows(self, workflows: List[WorkflowTransitionRulesDetails]):
        """Sets the workflows of this WorkflowsWithTransitionRulesDetails.

        The list of workflows with transition rules to delete.  # noqa: E501

        :param workflows: The workflows of this WorkflowsWithTransitionRulesDetails.
        :type workflows: List[WorkflowTransitionRulesDetails]
        """
        if workflows is None:
            raise ValueError("Invalid value for `workflows`, must not be `None`")  # noqa: E501

        self._workflows = workflows