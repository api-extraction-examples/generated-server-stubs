from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiV1AccountsIdNotePostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, comment=None):  # noqa: E501
        """ApiV1AccountsIdNotePostRequest - a model defined in OpenAPI

        :param comment: The comment of this ApiV1AccountsIdNotePostRequest.  # noqa: E501
        :type comment: str
        """
        self.openapi_types = {
            'comment': str
        }

        self.attribute_map = {
            'comment': 'comment'
        }

        self._comment = comment

    @classmethod
    def from_dict(cls, dikt) -> 'ApiV1AccountsIdNotePostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _api_v1_accounts__id__note_post_request of this ApiV1AccountsIdNotePostRequest.  # noqa: E501
        :rtype: ApiV1AccountsIdNotePostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def comment(self) -> str:
        """Gets the comment of this ApiV1AccountsIdNotePostRequest.

        The comment to be set on that user. Provide an empty string or leave out this parameter to clear the currently set note.  # noqa: E501

        :return: The comment of this ApiV1AccountsIdNotePostRequest.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this ApiV1AccountsIdNotePostRequest.

        The comment to be set on that user. Provide an empty string or leave out this parameter to clear the currently set note.  # noqa: E501

        :param comment: The comment of this ApiV1AccountsIdNotePostRequest.
        :type comment: str
        """

        self._comment = comment
