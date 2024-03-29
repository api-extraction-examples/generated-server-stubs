from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.approval_request_review_status import ApprovalRequestReviewStatus
from openapi_server import util

from openapi_server.models.approval_request_review_status import ApprovalRequestReviewStatus  # noqa: E501

class ApprovalRequestReview(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, creation_date=None, kind=None, member_id=None):  # noqa: E501
        """ApprovalRequestReview - a model defined in OpenAPI

        :param id: The id of this ApprovalRequestReview.  # noqa: E501
        :type id: str
        :param creation_date: The creation_date of this ApprovalRequestReview.  # noqa: E501
        :type creation_date: int
        :param kind: The kind of this ApprovalRequestReview.  # noqa: E501
        :type kind: ApprovalRequestReviewStatus
        :param member_id: The member_id of this ApprovalRequestReview.  # noqa: E501
        :type member_id: str
        """
        self.openapi_types = {
            'id': str,
            'creation_date': int,
            'kind': ApprovalRequestReviewStatus,
            'member_id': str
        }

        self.attribute_map = {
            'id': '_id',
            'creation_date': 'creationDate',
            'kind': 'kind',
            'member_id': 'memberId'
        }

        self._id = id
        self._creation_date = creation_date
        self._kind = kind
        self._member_id = member_id

    @classmethod
    def from_dict(cls, dikt) -> 'ApprovalRequestReview':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApprovalRequestReview of this ApprovalRequestReview.  # noqa: E501
        :rtype: ApprovalRequestReview
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ApprovalRequestReview.

        The unique resource id.  # noqa: E501

        :return: The id of this ApprovalRequestReview.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ApprovalRequestReview.

        The unique resource id.  # noqa: E501

        :param id: The id of this ApprovalRequestReview.
        :type id: str
        """

        self._id = id

    @property
    def creation_date(self) -> int:
        """Gets the creation_date of this ApprovalRequestReview.

        A unix epoch time in milliseconds specifying the date the approval request was reviewed  # noqa: E501

        :return: The creation_date of this ApprovalRequestReview.
        :rtype: int
        """
        return self._creation_date

    @creation_date.setter
    def creation_date(self, creation_date: int):
        """Sets the creation_date of this ApprovalRequestReview.

        A unix epoch time in milliseconds specifying the date the approval request was reviewed  # noqa: E501

        :param creation_date: The creation_date of this ApprovalRequestReview.
        :type creation_date: int
        """

        self._creation_date = creation_date

    @property
    def kind(self) -> ApprovalRequestReviewStatus:
        """Gets the kind of this ApprovalRequestReview.


        :return: The kind of this ApprovalRequestReview.
        :rtype: ApprovalRequestReviewStatus
        """
        return self._kind

    @kind.setter
    def kind(self, kind: ApprovalRequestReviewStatus):
        """Sets the kind of this ApprovalRequestReview.


        :param kind: The kind of this ApprovalRequestReview.
        :type kind: ApprovalRequestReviewStatus
        """

        self._kind = kind

    @property
    def member_id(self) -> str:
        """Gets the member_id of this ApprovalRequestReview.

        The unique resource id.  # noqa: E501

        :return: The member_id of this ApprovalRequestReview.
        :rtype: str
        """
        return self._member_id

    @member_id.setter
    def member_id(self, member_id: str):
        """Sets the member_id of this ApprovalRequestReview.

        The unique resource id.  # noqa: E501

        :param member_id: The member_id of this ApprovalRequestReview.
        :type member_id: str
        """

        self._member_id = member_id
