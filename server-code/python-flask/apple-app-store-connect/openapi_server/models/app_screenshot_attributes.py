from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_media_asset_state import AppMediaAssetState
from openapi_server.models.image_asset import ImageAsset
from openapi_server.models.upload_operation import UploadOperation
from openapi_server import util

from openapi_server.models.app_media_asset_state import AppMediaAssetState  # noqa: E501
from openapi_server.models.image_asset import ImageAsset  # noqa: E501
from openapi_server.models.upload_operation import UploadOperation  # noqa: E501

class AppScreenshotAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, asset_delivery_state=None, asset_token=None, asset_type=None, file_name=None, file_size=None, image_asset=None, source_file_checksum=None, upload_operations=None):  # noqa: E501
        """AppScreenshotAttributes - a model defined in OpenAPI

        :param asset_delivery_state: The asset_delivery_state of this AppScreenshotAttributes.  # noqa: E501
        :type asset_delivery_state: AppMediaAssetState
        :param asset_token: The asset_token of this AppScreenshotAttributes.  # noqa: E501
        :type asset_token: str
        :param asset_type: The asset_type of this AppScreenshotAttributes.  # noqa: E501
        :type asset_type: str
        :param file_name: The file_name of this AppScreenshotAttributes.  # noqa: E501
        :type file_name: str
        :param file_size: The file_size of this AppScreenshotAttributes.  # noqa: E501
        :type file_size: int
        :param image_asset: The image_asset of this AppScreenshotAttributes.  # noqa: E501
        :type image_asset: ImageAsset
        :param source_file_checksum: The source_file_checksum of this AppScreenshotAttributes.  # noqa: E501
        :type source_file_checksum: str
        :param upload_operations: The upload_operations of this AppScreenshotAttributes.  # noqa: E501
        :type upload_operations: List[UploadOperation]
        """
        self.openapi_types = {
            'asset_delivery_state': AppMediaAssetState,
            'asset_token': str,
            'asset_type': str,
            'file_name': str,
            'file_size': int,
            'image_asset': ImageAsset,
            'source_file_checksum': str,
            'upload_operations': List[UploadOperation]
        }

        self.attribute_map = {
            'asset_delivery_state': 'assetDeliveryState',
            'asset_token': 'assetToken',
            'asset_type': 'assetType',
            'file_name': 'fileName',
            'file_size': 'fileSize',
            'image_asset': 'imageAsset',
            'source_file_checksum': 'sourceFileChecksum',
            'upload_operations': 'uploadOperations'
        }

        self._asset_delivery_state = asset_delivery_state
        self._asset_token = asset_token
        self._asset_type = asset_type
        self._file_name = file_name
        self._file_size = file_size
        self._image_asset = image_asset
        self._source_file_checksum = source_file_checksum
        self._upload_operations = upload_operations

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshot_attributes of this AppScreenshotAttributes.  # noqa: E501
        :rtype: AppScreenshotAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def asset_delivery_state(self) -> AppMediaAssetState:
        """Gets the asset_delivery_state of this AppScreenshotAttributes.


        :return: The asset_delivery_state of this AppScreenshotAttributes.
        :rtype: AppMediaAssetState
        """
        return self._asset_delivery_state

    @asset_delivery_state.setter
    def asset_delivery_state(self, asset_delivery_state: AppMediaAssetState):
        """Sets the asset_delivery_state of this AppScreenshotAttributes.


        :param asset_delivery_state: The asset_delivery_state of this AppScreenshotAttributes.
        :type asset_delivery_state: AppMediaAssetState
        """

        self._asset_delivery_state = asset_delivery_state

    @property
    def asset_token(self) -> str:
        """Gets the asset_token of this AppScreenshotAttributes.


        :return: The asset_token of this AppScreenshotAttributes.
        :rtype: str
        """
        return self._asset_token

    @asset_token.setter
    def asset_token(self, asset_token: str):
        """Sets the asset_token of this AppScreenshotAttributes.


        :param asset_token: The asset_token of this AppScreenshotAttributes.
        :type asset_token: str
        """

        self._asset_token = asset_token

    @property
    def asset_type(self) -> str:
        """Gets the asset_type of this AppScreenshotAttributes.


        :return: The asset_type of this AppScreenshotAttributes.
        :rtype: str
        """
        return self._asset_type

    @asset_type.setter
    def asset_type(self, asset_type: str):
        """Sets the asset_type of this AppScreenshotAttributes.


        :param asset_type: The asset_type of this AppScreenshotAttributes.
        :type asset_type: str
        """

        self._asset_type = asset_type

    @property
    def file_name(self) -> str:
        """Gets the file_name of this AppScreenshotAttributes.


        :return: The file_name of this AppScreenshotAttributes.
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name: str):
        """Sets the file_name of this AppScreenshotAttributes.


        :param file_name: The file_name of this AppScreenshotAttributes.
        :type file_name: str
        """

        self._file_name = file_name

    @property
    def file_size(self) -> int:
        """Gets the file_size of this AppScreenshotAttributes.


        :return: The file_size of this AppScreenshotAttributes.
        :rtype: int
        """
        return self._file_size

    @file_size.setter
    def file_size(self, file_size: int):
        """Sets the file_size of this AppScreenshotAttributes.


        :param file_size: The file_size of this AppScreenshotAttributes.
        :type file_size: int
        """

        self._file_size = file_size

    @property
    def image_asset(self) -> ImageAsset:
        """Gets the image_asset of this AppScreenshotAttributes.


        :return: The image_asset of this AppScreenshotAttributes.
        :rtype: ImageAsset
        """
        return self._image_asset

    @image_asset.setter
    def image_asset(self, image_asset: ImageAsset):
        """Sets the image_asset of this AppScreenshotAttributes.


        :param image_asset: The image_asset of this AppScreenshotAttributes.
        :type image_asset: ImageAsset
        """

        self._image_asset = image_asset

    @property
    def source_file_checksum(self) -> str:
        """Gets the source_file_checksum of this AppScreenshotAttributes.


        :return: The source_file_checksum of this AppScreenshotAttributes.
        :rtype: str
        """
        return self._source_file_checksum

    @source_file_checksum.setter
    def source_file_checksum(self, source_file_checksum: str):
        """Sets the source_file_checksum of this AppScreenshotAttributes.


        :param source_file_checksum: The source_file_checksum of this AppScreenshotAttributes.
        :type source_file_checksum: str
        """

        self._source_file_checksum = source_file_checksum

    @property
    def upload_operations(self) -> List[UploadOperation]:
        """Gets the upload_operations of this AppScreenshotAttributes.


        :return: The upload_operations of this AppScreenshotAttributes.
        :rtype: List[UploadOperation]
        """
        return self._upload_operations

    @upload_operations.setter
    def upload_operations(self, upload_operations: List[UploadOperation]):
        """Sets the upload_operations of this AppScreenshotAttributes.


        :param upload_operations: The upload_operations of this AppScreenshotAttributes.
        :type upload_operations: List[UploadOperation]
        """

        self._upload_operations = upload_operations
