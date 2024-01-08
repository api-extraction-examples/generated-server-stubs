from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SemanticPatchInstructionInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, kind=None):  # noqa: E501
        """SemanticPatchInstructionInner - a model defined in OpenAPI

        :param kind: The kind of this SemanticPatchInstructionInner.  # noqa: E501
        :type kind: str
        """
        self.openapi_types = {
            'kind': str
        }

        self.attribute_map = {
            'kind': 'kind'
        }

        self._kind = kind

    @classmethod
    def from_dict(cls, dikt) -> 'SemanticPatchInstructionInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SemanticPatchInstruction_inner of this SemanticPatchInstructionInner.  # noqa: E501
        :rtype: SemanticPatchInstructionInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def kind(self) -> str:
        """Gets the kind of this SemanticPatchInstructionInner.

        The name of the modification you would like to perform on a resource.  # noqa: E501

        :return: The kind of this SemanticPatchInstructionInner.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind: str):
        """Sets the kind of this SemanticPatchInstructionInner.

        The name of the modification you would like to perform on a resource.  # noqa: E501

        :param kind: The kind of this SemanticPatchInstructionInner.
        :type kind: str
        """

        self._kind = kind