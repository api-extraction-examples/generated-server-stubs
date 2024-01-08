from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id_data import BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
from openapi_server import util

from openapi_server.models.bundle_id_capability_create_request_data_relationships_bundle_id_data import BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData  # noqa: E501

class BundleIdCapabilityCreateRequestDataRelationshipsBundleId(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BundleIdCapabilityCreateRequestDataRelationshipsBundleId - a model defined in OpenAPI

        :param data: The data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.  # noqa: E501
        :type data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """
        self.openapi_types = {
            'data': BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCapabilityCreateRequestDataRelationshipsBundleId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCapabilityCreateRequest_data_relationships_bundleId of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.  # noqa: E501
        :rtype: BundleIdCapabilityCreateRequestDataRelationshipsBundleId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData:
        """Gets the data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.


        :return: The data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.
        :rtype: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """
        return self._data

    @data.setter
    def data(self, data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData):
        """Sets the data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.


        :param data: The data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleId.
        :type data: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
