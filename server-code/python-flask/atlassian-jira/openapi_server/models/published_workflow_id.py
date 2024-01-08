from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PublishedWorkflowId(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, entity_id=None, name=None):  # noqa: E501
        """PublishedWorkflowId - a model defined in OpenAPI

        :param entity_id: The entity_id of this PublishedWorkflowId.  # noqa: E501
        :type entity_id: str
        :param name: The name of this PublishedWorkflowId.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'entity_id': str,
            'name': str
        }

        self.attribute_map = {
            'entity_id': 'entityId',
            'name': 'name'
        }

        self._entity_id = entity_id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'PublishedWorkflowId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PublishedWorkflowId of this PublishedWorkflowId.  # noqa: E501
        :rtype: PublishedWorkflowId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def entity_id(self) -> str:
        """Gets the entity_id of this PublishedWorkflowId.

        The entity ID of the workflow.  # noqa: E501

        :return: The entity_id of this PublishedWorkflowId.
        :rtype: str
        """
        return self._entity_id

    @entity_id.setter
    def entity_id(self, entity_id: str):
        """Sets the entity_id of this PublishedWorkflowId.

        The entity ID of the workflow.  # noqa: E501

        :param entity_id: The entity_id of this PublishedWorkflowId.
        :type entity_id: str
        """

        self._entity_id = entity_id

    @property
    def name(self) -> str:
        """Gets the name of this PublishedWorkflowId.

        The name of the workflow.  # noqa: E501

        :return: The name of this PublishedWorkflowId.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PublishedWorkflowId.

        The name of the workflow.  # noqa: E501

        :param name: The name of this PublishedWorkflowId.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name
