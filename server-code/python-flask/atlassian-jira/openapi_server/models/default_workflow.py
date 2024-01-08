from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DefaultWorkflow(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, update_draft_if_needed=None, workflow=None):  # noqa: E501
        """DefaultWorkflow - a model defined in OpenAPI

        :param update_draft_if_needed: The update_draft_if_needed of this DefaultWorkflow.  # noqa: E501
        :type update_draft_if_needed: bool
        :param workflow: The workflow of this DefaultWorkflow.  # noqa: E501
        :type workflow: str
        """
        self.openapi_types = {
            'update_draft_if_needed': bool,
            'workflow': str
        }

        self.attribute_map = {
            'update_draft_if_needed': 'updateDraftIfNeeded',
            'workflow': 'workflow'
        }

        self._update_draft_if_needed = update_draft_if_needed
        self._workflow = workflow

    @classmethod
    def from_dict(cls, dikt) -> 'DefaultWorkflow':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DefaultWorkflow of this DefaultWorkflow.  # noqa: E501
        :rtype: DefaultWorkflow
        """
        return util.deserialize_model(dikt, cls)

    @property
    def update_draft_if_needed(self) -> bool:
        """Gets the update_draft_if_needed of this DefaultWorkflow.

        Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.  # noqa: E501

        :return: The update_draft_if_needed of this DefaultWorkflow.
        :rtype: bool
        """
        return self._update_draft_if_needed

    @update_draft_if_needed.setter
    def update_draft_if_needed(self, update_draft_if_needed: bool):
        """Sets the update_draft_if_needed of this DefaultWorkflow.

        Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.  # noqa: E501

        :param update_draft_if_needed: The update_draft_if_needed of this DefaultWorkflow.
        :type update_draft_if_needed: bool
        """

        self._update_draft_if_needed = update_draft_if_needed

    @property
    def workflow(self) -> str:
        """Gets the workflow of this DefaultWorkflow.

        The name of the workflow to set as the default workflow.  # noqa: E501

        :return: The workflow of this DefaultWorkflow.
        :rtype: str
        """
        return self._workflow

    @workflow.setter
    def workflow(self, workflow: str):
        """Sets the workflow of this DefaultWorkflow.

        The name of the workflow to set as the default workflow.  # noqa: E501

        :param workflow: The workflow of this DefaultWorkflow.
        :type workflow: str
        """
        if workflow is None:
            raise ValueError("Invalid value for `workflow`, must not be `None`")  # noqa: E501

        self._workflow = workflow
